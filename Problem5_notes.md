Algorithms explaination
====
Problem 5
----------
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to n?

Let take some basic example: 
- The smallest number that can be divided by 1, 2, 3 is 6. How can i get 6?

Step1:
By multiplicate each of the number from 1 to 3 together : 1x2x3 = 6

- 12 is the smallest number that can be divided by 1, 2, 3 and 4. How can iget 12?

Step1:
By similar method like in the precedent example except 4 : 1x2x3= 6. 

Step2: Because that 6%2=0; Do this 6X2 = 12.

- 60 is the smallest number that can be divided by 1, 2, 3, 4 and 5.

step1: same methode : 1x2x3x2(4%2==0)x5(because that 5 is prime) = 60.

- How about 6? We know that 6%2=0 and 6%3=0. Can we multiplicate 60X2 or 60X3 to get the smallest number that can be divided by 1, 2,...6?
NO, because 6 can also divided 60 ;)

- Conclusion : 

Multiplicate all elements in the serie together and check if each element can be divided with 2 or 3 and than 
replace the respective element with 2 or 3. 
Check if the element is prime and then multiplicate the product of each values in the serie with the prime number.
Check if the product of each values in the serie can be divided with the next element in the serie than do NOTHING! 