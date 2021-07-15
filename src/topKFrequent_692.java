

/**
 * @author ZichaoXie
 * @date 2021/7/13 下午5:07
 * @Description:给一非空的单词列表，返回前 k 个出现次数最多的单词。
 *
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 */
public class topKFrequent_692 {
//    Map<String, Integer> cnt = new HashMap<String, Integer>();
//        for (String word : words) {
//        cnt.put(word, cnt.getOrDefault(word, 0) + 1);
//    }
//    List<String> rec = new ArrayList<String>();
//        for (Map.Entry<String, Integer> entry : cnt.entrySet()) {
//        rec.add(entry.getKey());
//    }
//        Collections.sort(rec, new Comparator<String>() {
//        public int compare(String word1, String word2) {
//            return cnt.get(word1) == cnt.get(word2) ? word1.compareTo(word2) : cnt.get(word2) - cnt.get(word1);
//        }
//    });
//        return rec.subList(0, k);
//    public List<String> topKFrequent(String[] words, int k) {
//        Map<String,Integer> map = new HashMap<>();
//        for (String word:words){
//            map.put(word,map.getOrDefault(word,0)+1);
//        }
//        List<String> retList = new ArrayList<>();
//        for (Map.Entry<String ,Integer> entry:map.entrySet()){
//            retList.add(entry.getKey());
//        }
//
//        Collections.sort(retList, new Comparator<String>() {
//            @Override
//            public int compare(String s, String t1) {
//                return map.get(s)==map.get(t1)?s.compareTo(t1):map.get(s)-map.get(t1);
//            }
//        });
//    }
}
