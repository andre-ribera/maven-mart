package MavenMarketApp.Employee;

import MavenMarketApp.Department.Department;

import java.util.HashMap;
import java.util.Map;

public class StoreManager extends Manager {
    private static Map<Department, Integer> deptBudgets = new HashMap<>();
    private static int storeBudget;

    public static void balanceBudget(){
        int sum = 0;

        for(Map.Entry<Department, Integer> entry : deptBudgets.entrySet()) {
            System.out.println(entry.getKey().toString() + ": " + entry.getValue().toString());
            sum += entry.getValue();
        }

        StoreManager.storeBudget = sum;
    }

    public void getStoreBudget(){
        System.out.println("Store Budget: " + StoreManager.storeBudget);
    }

    @Override
    public String morningMeeting() {
        return "If you can get me those reports that would be great.";
    }
}
