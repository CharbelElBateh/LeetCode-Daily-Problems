//LeetCode#692 Top K Frequent Words
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        //Top k frequent words implies the use of a priority queue of size k
        //Adding and removing n element from a priority queue in java is made in O(n log2(n))
        //Using a map holding all n elements: O(n)
        //
        //Global Time Complexity: O(n log2(n))
        //Global Space Complexity: O(n)

        //Map holding words and their frequencies
        Map<String, Integer> map = new HashMap<>();
        
        //Populating the hashmap
        for(int i = 0; i<words.length; i++){
            if(map.containsKey(words[i])){
                map.replace(words[i], 1+map.get(words[i]));
            }else{
                map.put(words[i], 1);
            }
        }
        
        //Map that stores map entries by lowest frequency to highest and, at equal frequencies, in alphabetical order
        Queue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((e1, e2) -> {
            if(e1.getValue() == e2.getValue()) return e2.getKey().compareTo(e1.getKey());
            else return e1.getValue() - e2.getValue();
        } );
        
        //Populating the Priority queue and keeping only k elements at any given moment
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k) pq.poll();
        }
        
        //Output list
        LinkedList<String> list = new LinkedList<>();
        while(!pq.isEmpty()){
            list.addFirst(pq.poll().getKey());
        }
        
        return list;
    }
}