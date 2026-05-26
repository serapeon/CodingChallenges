"""
Write a function, score_sorter(), that will take a list of unsorted scores along with the highest possible score. 
It should return a sorted list of all of the scores, in descending order from high to low. You are expected to create 
and implement your own sorting algorithm for this challenge.

For example, score_sorter([1, 2, 3, 9999, 13], 10000) should return [9999, 13, 3, 2, 1].
"""
def score_sorter(array, top_score):
  """Return array in sorted descending order"""
  # checking boundary condition
  for x in array:
    if x > top_score: return "Element in list too big"
    
  temp = 0
  for x in range(len(array)):
    for y in range(len(array)):
      if array[x] > array[y]:
        temp = array[y]
        array[y] = array[x]
        array[x] = temp
  return array

score_list = [1, 2, 3, 9999, 13]
top = 10000

print(score_sorter(score_list, top))