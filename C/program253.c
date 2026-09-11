#include<stdio.h>
#include<fcntl.h>

int main()
{
    int fd = 0;             // File Descriptior

    fd = creat("Marvellous.txt",0777);

    if(fd == -1)
    {
        printf("Unable to Create File\n");
    }
    else
    {
        printf("File Gets Succesfully created!!\n");
    }

    return 0;
}
