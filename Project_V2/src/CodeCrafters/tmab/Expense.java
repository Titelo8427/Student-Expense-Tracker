package CodeCrafters.tmab;
import java.text.DecimalFormat;
public class Expense {
    private String date;
    private String category;
    private double amount;
    private String description;
    
    public Expense(String date, String category, double amount, String description) {
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    public String getDate() { 
        return date; 
    }
    
    public void setDate(String date) { 
        this.date = date; 
    }
    
    public String getCategory() { 
        return category; 
    }
    
    public void setCategory(String category) { 
        this.category = category; 
    }
    
    public double getAmount() { 
        return amount; 
    }
    
    public void setAmount(double amount) { 
        this.amount = amount; 
    }
    
    public String getDescription() { 
        return description; 
    }
    
    public void setDescription(String description) { 
        this.description = description; 
    }
    
    // Formatted string for display
    public String toString() {
        return String.format("📅 %-10s | 🏷 %-15s | 💵 R%-8.2f | 📝 %-20s", 
               date, category, amount, description);
    }
    
    // Format for file storage
    public String toFileString() {
        DecimalFormat df = new DecimalFormat("R###.00");
        
        return  date + "\t" + category + "\t" + df.format(amount) + "\t" +  description;
    }
}


