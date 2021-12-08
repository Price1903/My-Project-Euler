# Find prime factors
### Ordinary Solution
* We use **short division** to find all prime factors of a number.
 Such like this:
```java
num
factor = 2
while num >= factor:
	if num % factor == 0:
    		print(factor)
            num /= factor
    else:
        	factor++
```
**The prime factors are from small to large.**
### Algorithm Optimization
* If the num is very large, it would take quite time to reach the last prime. So, we need optimization.
1. First of all: We can first check if the num is a prime. If it is, the following codes won't execute.  
2. Second: 2 is the only even prime, so if we treat 2 separately we can make the algorithm exectues faster. That means we need make the num divides 2 until it isn't the multiple of 2.
3. There is an obvious but important tip:  ***Every number n can at most have ome prime factor greater than sqrt(n).*** After dividing out some prime factor, calculate the square root of the remaining number we can use that square root as upper limit for factor.
```java
public static void findPrimeFactors(int num){
        /*
        first check if the num is a prime(omit)
         */
        
        if(num % 2 == 0){
            System.out.println(2);
            while (num % 2 == 0){
                System.out.println(2);
                num /= 2;
            }
        }
        
        long factor = 3;
        while (num >= factor){
            long sqrt = (long)Math.sqrt(num);
            if(num % factor == 0){
                System.out.println(factor);
                num /= factor;
                if(factor > sqrt) break;
            }else{
                factor++;
            }
        }
    }
 ```
 * We need to get the sqrt of the **remaining number**, so we should put the sqrt statement in the while loop.
 * SPECIAL ATTENTION SHOULD BE PAID TO THE POSIZATION OF **long sqrt = (long)Math.sqrt(num);** AND **if(factor > sqrt) break;** Because we need to compare the prime factor to the square root of current number, don't put the statement which get the square root value below  **num /= factor;**
 

	
