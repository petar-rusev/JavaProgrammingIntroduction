package PrintDeckOfCards;
import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Element;

public class DeckOfCards {



public static void main(String[] args){
Document document=new Document();
	try{
	PdfWriter.getInstance(document,new FileOutputStream("DeckOfCards.pdf"));
	document.open();
	BaseFont baseFont = BaseFont.createFont("/home/pesho87/workspace/IntroductionToJavaProgramming/fonts/times.ttf", BaseFont.IDENTITY_H, true);
	
	Font BigBlackColor=new Font(baseFont,30f,0,BaseColor.BLACK);
	Font BigRedColor=new Font(baseFont,30f,0,BaseColor.RED);
	
    String spade="\u2660";
    String diamond="\u2666";
    String club="\u2663";
    String heart="\u2665";
    String [] symbols={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String [] paint ={spade,heart,diamond,club};
    
    for(int i=0;i<4;i++){
    	
    	
    		
	    	if(i==0)
	    	{
	    		for(int j=0;j<13;j++){
	    			PdfPTable tableSpade = new PdfPTable(1);
	    		    tableSpade.setHorizontalAlignment(Element.ALIGN_LEFT);
	    		    
	    		    tableSpade.setWidthPercentage(12.5f);
	    		    
	    		    Paragraph para = new Paragraph(paint[i]+symbols[j],BigBlackColor);
	    		    para.setAlignment(Element.ALIGN_CENTER); 
	    	        para.setLeading(0, 1);
	    		    PdfPCell cell = new PdfPCell();
	    		    cell.setMinimumHeight(60);
	    		    cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
	    		    
	    		    cell.addElement(para);
	    		    tableSpade.addCell(cell);
	    		    tableSpade.setSpacingAfter(10f);
	    		    document.add(tableSpade);
	    		
	    		}
	    	}
	    	else if(i==1)
	    	{
	    		for(int j=0;j<13;j++){
		    		PdfPTable tableHeart = new PdfPTable(1);
		    		tableHeart.setHorizontalAlignment(Element.ALIGN_LEFT);
				    
		    		tableHeart.setWidthPercentage(12.5f);
				    
				    Paragraph para = new Paragraph(paint[i]+symbols[j],BigRedColor);
				    para.setAlignment(Element.ALIGN_CENTER); 
			        para.setLeading(0, 1);
				    PdfPCell cell = new PdfPCell();
				    cell.setMinimumHeight(60);
				    cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				    
				    cell.addElement(para);
				    tableHeart.addCell(cell);
				    tableHeart.setSpacingAfter(10f);
				    document.add(tableHeart);
	    		}
	    		
	    	}
	    	else if(i==2)
	    	{
	    		for(int j=0;j<13;j++){
		    		PdfPTable tableDiamond = new PdfPTable(1);
		    		tableDiamond.setHorizontalAlignment(Element.ALIGN_LEFT);
				    
		    		tableDiamond.setWidthPercentage(12.5f);
				    
				    Paragraph para = new Paragraph(paint[i]+symbols[j],BigRedColor);
				    para.setAlignment(Element.ALIGN_CENTER); 
			        para.setLeading(0, 1);
				    PdfPCell cell = new PdfPCell();
				    cell.setMinimumHeight(60);
				    cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				    
				    cell.addElement(para);
				    tableDiamond.addCell(cell);
				    tableDiamond.setSpacingAfter(10f);
				    document.add(tableDiamond);
	    		}
	    		
	    	}
	    	else
	    	{
	    		for(int j=0;j<13;j++){
		    		PdfPTable tableClub = new PdfPTable(1);
		    		tableClub.setHorizontalAlignment(Element.ALIGN_LEFT);
				    
		    		tableClub.setWidthPercentage(12.5f);
				    
				    Paragraph para = new Paragraph(paint[i]+symbols[j],BigBlackColor);
				    para.setAlignment(Element.ALIGN_CENTER); 
			        para.setLeading(0, 1);
				    PdfPCell cell = new PdfPCell();
				    cell.setMinimumHeight(50);
				    cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				    
				    cell.addElement(para);
				    tableClub.addCell(cell);
				    tableClub.setSpacingAfter(5f);
				    document.add(tableClub);
	    		}
	    	}
    	}
    
   

    
    document.close();
	
    	
}catch(Exception e){
}

}
}











