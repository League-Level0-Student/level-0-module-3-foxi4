void setup(){
  size(500,450);
}
void draw(){
  int size=400;
  for(int i=0;i<8;i++){
    int ellipse=i;
    if(ellipse % 2==0){
  fill(#FF0000);
    }
    else{
      fill(#000000);
    }
  ellipse(250,225,size,size);
  size-=50;
    
  }


}
