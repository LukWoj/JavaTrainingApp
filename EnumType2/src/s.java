
enum SIZE {
    SMALL(34) ,
    MEDIUM(38) ,
    LARGE(42) ,
    XLARGE(46);

    private int size ;

    SIZE(int size){
        this.size = size ;
    }

    public static SIZE getSize(int size){
        if(size >= 34 && size < 38 ) return SMALL ;
        if(size >= 38 && size < 42 ) return MEDIUM ;
        if(size >= 42 && size < 46 ) return LARGE ;
        if(size >= 46 ) return XLARGE ;

        else throw new IllegalArgumentException("Invalid size") ;
    }
}