/*
find the sum of the even-valued terms in the Fibonacci sequence.
(do not exceed 4000000)
 */
class Solution02 {
    public static void main(String[] args) {
        int first_term = 1;
        int second_term = 2;
        int third_term = 3;
        int no = 3;
        long res = second_term;
        int limit = 4000000;
        while(first_term <= limit && second_term <= limit && third_term <= limit){
            if(no % 3 == 0){
                if (third_term % 2 == 0){
                    res += third_term;
                }
                first_term = second_term + third_term;
            }else if(no % 3 == 1){
                if (first_term % 2 == 0){
                    res += first_term;
                }
                second_term = first_term + third_term;
            }else if(no % 3 == 2){
                if (second_term % 2 == 0){
                    res += second_term;
                }
                third_term = first_term + second_term;
            }
            no++;
        }
        System.out.println(res);
    }
}