int lengthOfLastWord(char* s) {
    int len = strlen(s);
    int count=0;
    int i=1;
    while(i>0){
        if(s[len-1]==' '){
            len--;
        }
        else
            i=-1;
    }
    for(int i=len-1;i>=0;i--){
        if(s[i] != ' '){
            count++;
        }
        else
            break;
    }
    return count;
}