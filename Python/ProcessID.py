import os

def main():
    print("PID of Running Process is: ",os.getpid())
    print("PID of Parent Prcoess is: ",os.getppid())
    
if __name__=="__main__":
    main()
