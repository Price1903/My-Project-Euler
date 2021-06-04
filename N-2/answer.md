# Even Fibonacci numbers
### My Solution
* I declare 3 variables, they are used to hold the 3 current values in Fibonacci sequence. 
* And the variable named no is used to identify the current no in Fibonacci sequence.
* Because I don't know exactly when will the loop terminates, I choose the while loop.
* In the wihle scope, I use the **no** to determine which variable I should update. A if-else statement is suitable.
```java
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
```

==I have't rebuilt the code, so it looks terrible==
### Better Solution
* In My Solution, I use 3 variables to hold the Fibonacci values, and I update variables by the variable **no**. Actually, there is a better way.
* **just 3 variables in need**
 They are called previous, current and next.
 The updating process is as follows
 
  ```
 	 	next = current + previous
     	    previous = current
    	    current = next
  ```
   
   Through this, we just need to judge the **current** value to see 	if it is not exceed 4 million.
* So, the better solution
```java
class Solution02 {
    public static void main(String[] args) {
        int previous = 1;
        int current = 2;
        int next;
        int res = 0;
        while (current <= 4000000) {
            if (current % 2 == 0)
                res += current;
            next = previous + current;
            previous = current;
            current = next;
        }
        System.out.println(res);
    }
}
```
### Get rid of the testing for every values.
![本地图片{80x400}](D:\截图\Fibonacci.png)
==We can find every third Fibonacci number is even.==
* To get rid of the testing for every values, **we need to find the relationship between E(n), E(n-1) and E(n-2). In other words,
 F(n), F(n-3) and F(n-6).**
* We can derive this formula through F(n) = F(n-1) + F(n-2).
 Finally, we get F(n) = 4\*F(n-3) + F(n-6)
 
