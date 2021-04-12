class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar("tree");
    tree.cutOut(tree.getShape(), 10);
    tree.setBake(350, 12);
    tree.decorateCookie(tree.getIsReady());

    Sugar aCookie = new Sugar();
    aCookie.decorateCookie(aCookie.getIsReady());
  }
}