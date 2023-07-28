import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<DataObject2> dataList = new ArrayList<>();
        dataList.add(new DataObject2(10, "apple"));
        dataList.add(new DataObject2(5, "banana"));
        dataList.add(new DataObject2(15, "orange"));
        dataList.add(new DataObject2(8, "kiwi"));
        dataList.add(new DataObject2(10, "pear"));

        // 내림차순 정렬
        Collections.sort(dataList, new CustomComparator());

        // 정렬된 데이터 출력
        for (DataObject2 data : dataList) {
            System.out.println(data.getIntValue() + ", " + data.getStringValue());
        }
    }
}

class DataObject2 {
    private int intValue;
    private String stringValue;

    public DataObject2(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}

class CustomComparator implements Comparator<DataObject2> {
    @Override
    public int compare(DataObject2 data1, DataObject2 data2) {
        // intValue를 기준으로 내림차순 정렬
        if (data1.getIntValue() > data2.getIntValue()) {
            return -1;
        } else if (data1.getIntValue() < data2.getIntValue()) {
            return 1;
        }

        // intValue가 같으면 stringValue의 길이로 오름차순 정렬
        return Integer.compare(data1.getStringValue().length(), data2.getStringValue().length());
    }
}
