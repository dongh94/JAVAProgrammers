import java.util.PriorityQueue;

public class ComparableExample {
    public static void main(String[] args) {
        PriorityQueue<DataObject2> dataList = new PriorityQueue<>();
        dataList.add(new DataObject2(10, "apple"));
        dataList.add(new DataObject2(5, "banana"));
        dataList.add(new DataObject2(15, "orange"));
        dataList.add(new DataObject2(8, "kiwi"));
        dataList.add(new DataObject2(10, "pear"));

        // 내림차순 정렬
        // 정렬된 데이터 출력
        while (!dataList.isEmpty()) {
            System.out.println(dataList.poll().toString());
        }
    }
}

class DataObject implements Comparable<DataObject2> {
    private int intValue;
    private String stringValue;

    public DataObject(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    @Override
    public int compareTo(DataObject2 other) {
        // intValue를 기준으로 내림차순 정렬
        if (this.intValue > other.getIntValue()) {
            return -1;
        } else if (this.intValue < other.getIntValue()) {
            return 1;
        }
        // ==
        // intValue가 같으면 stringValue의 길이로 오름차순 정렬
        return Integer.compare(this.stringValue.length(), other.getStringValue().length());
    }

    @Override
    public String toString() {
        return getIntValue() + ", " + getStringValue();
    }
}
