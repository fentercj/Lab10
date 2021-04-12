class Sugar extends Cookie{
  String shape;
  boolean isDecorated;

  Sugar(){
    shape = "";
    isDecorated = false;
    }

  Sugar(String aShape){
    shape = aShape;
    isDecorated = false;
    }

  String getShape(){
    return shape;
    }

  void setShape(String aShape){
    shape = aShape;
    }

  void cutOut(String aShape, int aNumCookies){
    System.out.println(aNumCookies + " cookies were cut into a " + shape);
    setNumCookies(aNumCookies);
    }

void decorateCookie(boolean aIsReady){
  if(aIsReady == true){
    isDecorated = true;
    System.out.println("The cookies were decorated.");
    }
  else{
    System.out.println("Make sure to bake the cookies first.");
    }
  }
}