public enum Region {
    Central_Coast("Central Coast"), Southern_California("Southern California"), Northern_California("Northern California"), Varies("Varies");
    private String label;
    private Region(String label) {
        this.label = label;
    }
    
    public static Region findByLabel(String byLabel) {
        for(Region r: Region.values()) {
            if (r.label.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }    
}

//Alternatively:-
/*
public enum Region {
    Central_Coast("Central Coast"), Southern_California("Southern California"), Northern_California("Northern California"), Varies("Varies");
    private String value;
    private static final Map<String, Region> by_Value = new HashMap<>();
    
    private Region(String value) {
        this.value = value;
    }
    
     public String getValue() {
        return this.value;
    }
    
    public static Region getByName(String name) {
        return by_Value.get(name);
    }
    
    static {
        for (Region region: Region.values()) {
            by_Value.put(region.getValue(), region);
        }
    }
}
*/
