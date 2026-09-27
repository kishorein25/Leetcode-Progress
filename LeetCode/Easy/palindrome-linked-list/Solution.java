        Stack<Integer> st = new Stack<>();
        ListNode temp = head;

        while(temp != null){
            st.push(temp.val);
    public boolean isPalindrome(ListNode head) {
class Solution {
            temp = temp.next;
        }

        temp = head;
        while(!st.isEmpty()){
            if(st.pop() != temp.val){
                return false;
            }
            temp = temp.next;
        }
        return true;
