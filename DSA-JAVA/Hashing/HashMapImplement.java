import java.util.*;

public class HashMapImplement {

    static class HashMap<K, V> { // generic
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n (number of nodes)
        private LinkedList<Node> buckets[]; // N = buckets length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.size = 0;
            this.buckets = new LinkedList[4];

            // Initialize empty linked lists for each bucket
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // Hashing function to find the bucket index
        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % buckets.length;
        }

        // Searches for the key in a specific linked list (bucket)
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i; // data index
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[oldBuckets.length * 2]; // Double the size

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Transfer existing data to the new buckets
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        // Insert or update a key-value pair
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // Key doesn't exist, insert new node
                buckets[bi].add(new Node(key, value));
                size++;
            } else { // Key exists, update value
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            // Check load factor to decide if rehashing is needed
            double lambda = (double) size / buckets.length;
            if (lambda > 2.0) {
                rehash();
            }
        }

        // Check if the map contains a specific key
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        // Remove a key-value pair and return the value
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].remove(di);
                size--;
                return node.value;
            }
        }

        // Retrieve the value associated with a key
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            } else {
                return buckets[bi].get(di).value;
            }
        }

        // Return a list containing all the keys in the map
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    keys.add(ll.get(j).key);
                }
            }
            return keys;
        }

        // Return whether the map is empty
        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Testing the implementation
        map.put("India", 140);
        map.put("China", 141);
        map.put("US", 33);
        map.put("Indonesia", 27);

        System.out.println("Keys: " + map.keySet());
        System.out.println("Population of India: " + map.get("India"));

        System.out.println("Contains 'US'? " + map.containsKey("US"));

        System.out.println("Removing 'China': " + map.remove("China"));

        System.out.println("Keys after removal: " + map.keySet());
        System.out.println("Is map empty? " + map.isEmpty());
    }
}