import multiprocessing
import os
import time

def SumEven(No):
    print("PID of SumEven",os.getpid())     #51
    print("PPID of SumEven",os.getppid())   #21
    sum = 0
    for i in range(2,No+1,2):
        sum = sum + i

    print("EvenSum is: ",sum)
    
def SumOdd(No):
    print("PID of SumOdd",os.getpid())  #101
    print("PPId of SumOdd ",os.getppid()) #21
    sum = 0
    for i in range(1,No+1,2):
        sum = sum + i

    print("Odd Sum is: ",sum)

def main():
    print("PID of main",os.getpid())        #CMD 21
    print("PPId of main ",os.getppid())     #CMD 11

    start_time=time.time()
    t1=multiprocessing.Process(target=SumEven,args=(100000000,))
    t2=multiprocessing.Process(target=SumOdd,args=(100000000,))

    t1.start()
    t2.start()

    t1.join()
    t2.join()
    end_time=time.time()

    print("Actual time required",end_time-start_time)
    

if __name__ == "__main__":
    main()
