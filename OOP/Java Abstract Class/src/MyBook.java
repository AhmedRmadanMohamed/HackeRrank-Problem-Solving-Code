class MyBook extends Book {


    @Override
    void setTitle(String s) {
        super.title = s;
    }


    String getTitle() {

        return super.title;

    }


}
