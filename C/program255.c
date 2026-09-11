#include<stdio.h>
#include<fcntl.h>

int main()
{
    int fd = 0;             // File Descriptior

    fd = open("ABC.txt",O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to Open File\n");
    }
    else
    {
        printf("File Gets Succesfully Open with fd : %d\n",fd);
    }

    return 0;
}
