 #list Duplicate
Value = [1,2,3,4,5,1] 
print(Value[0])  #1
Value[2] = 35
print(Value)

 #tuple Duplicate
Value1 = (1,2,3,4,5,1)   #1
#Value1[2] =  35   #error
print(Value1)

#set No Duplicate
Value2 = {1,2,3,4,5,1}  
print(Value2[0])  #error(no index in set)
