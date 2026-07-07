package EMVQR;

public class EMWfield {
    private  EMWtag tag;
    private int length;
    private  String values;

    public EMWfield(EMWtag tag, int length, String values) {
        this.tag= tag;
        this.length = length;
        this.values = values;
    }

    public EMWtag getTag() {
        return tag;
    }

    public void setTag(EMWtag tag) {
        this.tag = tag;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "EMWfield{" +
                "tag=" + tag +
                ", length=" + length +
                ", values='" + values + '\'' +
                '}';
    }
}
