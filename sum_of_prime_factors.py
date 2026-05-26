"""
Create a sum_of_prime_factors() function that takes in an integer n and returns the sum of all of its prime factors. 
As a reminder, a prime number is a number whose only factors are one and itself. Therefore, a prime factor is a factor 
of a given number that itself is a prime number.

For example, sum_of_prime_factors(91) should return 20 since its prime factors are 13 and 7. 
"""
def isPrime(m):
  """Return True if m is a prime number."""
  if m < 2:
    return False
  for i in range(2, m):
    if m%i == 0:
      return False
  return True

def sum_of_prime_factors(n):
  """Return sum of prime factors of n"""
  # checking boundary conditions
  if type(n) != int or n < 2:
    return 0
  elif isPrime(n):
    return n

  myList = []
  count = 0
  
  for i in range(2, n):
    if isPrime(i):
      myList.append(i)
  
  # outer for-loop because loop has to restart every time n is divided
  for y in range(n):
    for x in myList:
      if isPrime(n):
        count += n
        return count
      elif n%x == 0:
        count += x
        n = int(n/x)
        break

print(sum_of_prime_factors(91))