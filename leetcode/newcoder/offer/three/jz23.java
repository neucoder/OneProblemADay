package newcoder.offer.three;

public class jz23 {
    public class Solution {
        public boolean VerifySquenceOfBST(int [] sequence) {
            if(sequence==null||sequence.length==0){
                return false;
            }
            return isSquenceOfBST(sequence, 0, sequence.length-1);
        }

        public boolean isSquenceOfBST(int [] sequence, int start, int end) {
            if(start>=end)
            {
                return true;
            }

            int index = start;
            int root = sequence[end];
            while (sequence[index]<root){
                index++;
            }
            int j = index;
            while (j<end){
                if(sequence[j]<root){
                    return false;
                }
                j++;
            }

            return isSquenceOfBST(sequence, start, index-1) && isSquenceOfBST(sequence, index,end-1);
        }
    }
}
