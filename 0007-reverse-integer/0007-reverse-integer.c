int reverse(int x){
    if (x <= INT_MIN) {
        return 0; 
    }
    int num;
    if(x<0)
        num=1;
    else
        num=0;
    x=abs(x);
    int last,reverse=0; 
    while(x>0){
         last=x%10;
         if (reverse > INT_MAX / 10 || (reverse == INT_MAX / 10 && last > INT_MAX % 10)) {
            return 0;  
        }
         reverse=(reverse*10)+last;
         x=x/10;
    }
    x=reverse;
    if(num==1)
        return -x;
    return x;
}