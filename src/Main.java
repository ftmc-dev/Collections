//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String word = "I want ice cream and I also want to go to school and eat";
    String[] words = word.split(" ");
    Map<String, Integer> map = new HashMap<>();
    int n = 1;
    for (String word2 : words) {
        if(map.containsKey(word2)) {
            map.put(word2, map.get(word2) + 1);
        }else{
            map.put(word2, 1);
        }
    }
    System.out.println(map);
}
