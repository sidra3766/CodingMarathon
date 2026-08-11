/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return new int[]{-1,-1};
        }
        int count = 1;
        ListNode prev = head;
        ListNode curr = head.next;
        List<Integer> criticalpoints = new ArrayList<>();

        while(curr.next != null){
            boolean isPeak = curr.val>prev.val && curr.val>curr.next.val;
            boolean isValley = curr.val<prev.val && curr.val<curr.next.val;

            if(isPeak || isValley){
                criticalpoints.add(count);
            }
            prev = curr;
            curr = curr.next;
            count = count+1;
        }
        if(criticalpoints.size()<2){
            return new int[]{-1,-1};
        }
        int maxDist = criticalpoints.get(criticalpoints.size()-1) - criticalpoints.get(0);
        int minDist = Integer.MAX_VALUE;

        for(int i=1;i<criticalpoints.size();i++){
            minDist = Math.min(minDist,criticalpoints.get(i)-criticalpoints.get(i-1));

        }
        return new int[]{minDist,maxDist};
            
    }
}
