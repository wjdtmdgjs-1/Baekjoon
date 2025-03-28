import java.util.Arrays;
class Solution {
	public int solution(int[] people, int limit) {
		int answer = 0;
		boolean[] visited = new boolean[people.length];	
		Arrays.sort(people);
		for(int i = people.length - 1 ; i >= 0 ; i--) {
			if(visited[i]) continue;
			visited[i] = true;
			answer++;
			int remainWeight = limit - people[i];
			int index = Arrays.binarySearch(people,remainWeight + 1);
			if (index < 0)index = -index -1;
			index--;
			for(int j = index ; j >= 0 ; j--) {
				if(!visited[j] && remainWeight >= people[j]){
				visited[j] = true;
				break;
				}
			}
		}
		return answer;
	}
}