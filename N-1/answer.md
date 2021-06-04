# Multiples of 3 and 5
### My Solution
Use a for loop to **traverse** the numbers from 1 to 999, check if each number meets the **criteria**.
(remember: or)
```
/*
*Multiples of 3 and 5
*/
class Solution01 {
    public static void main(final String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        System.out.print(sum);
    }
}
```
**answer: 233168**