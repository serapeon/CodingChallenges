"""
Create a prime_finder() function that takes in a number, n, and returns all the prime numbers from 1 to n (inclusive). 
As a reminder, a prime number is a number that is only divisible by 1 and itself.

For example, prime_finder(11) should return [2, 3, 5, 7, 11].
"""

# code is faster if there is a separate function for testing an individual number
def isPrime(m):
  """Return True if m is a prime number."""
  if m < 2:
    return False
  for i in range(2, m):
    if m%i == 0:
      return False
  return True

def prime_finder(n):
  """Return list of prime numbers from 1 to n (inclusive)."""

  retList = []
  # checking boundary conditions
  if n <= 1:
    return retList
  elif n == 2:
    retList.append(n)
    return retList

  myList = list(range(2, n+1))
  
  for x in myList:
    if isPrime(x):
      retList.append(x)
        
  return retList

print(prime_finder(11))
