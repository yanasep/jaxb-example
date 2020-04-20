package book;

import jaxb.JAXBHelper;

import javax.xml.bind.JAXBException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Book holmes = new Book();
        holmes.setPages(1200);
        holmes.setRank(76869);
        holmes.setWeight(1837.05);
        holmes.setTitle("The Complete Sherlock Holmes : Works include: The Hound of the Baskervilles; A Study in Scarlet; The Adventures of Sherlock Holmes; The Memoirs of Sherlock Holmes; The Return of Sherlock Holmes");
        holmes.setIsbn10("0785837353");
        holmes.setIsbn13("9780785837350");
        holmes.setImprint("Chartwell Books Inc.,U.S.");
        holmes.setPublisher("Book Sales Inc");
        holmes.setPublicationCity("Edison");
        holmes.setPublicationCountry("United States");
        holmes.setLanguage("English");
        holmes.setDescription("Part of the elegant Chartwell Classics series, The Complete Sherlock Holmes comprises 4 full-length novels and 56 short stories featuring the world's most famous pipe-smoking detective.\n" +
                "\n" +
                "Written by Sir Arthur Conan Doyle between the years 1867 and 1927, the legendary Sherlock Holmes employed his mastery of deductive reasoning and expert sleuthing to solve an array of complex and harrowing cases. From his home--221B Baker Street in London--the legendary Sherlock Holmes (accompanied by his loyal companion and chronicler, Dr. Watson) baffled policemen and became famous worldwide for his remarkable observations and even more eccentric habits.\n" +
                "\n" +
                "Containing every known Sherlock Holmes tale ever written and featuring a comprehensive introduction by renowned Holmes scholar Daniel Stashower (author of A Teller of Tales: The Life of Arthur Conan Doyle and Sherlock Holmes in America) with enlightening information on the author's life and works, this elegantly designed edition brings the world's greatest detective to life. From Holmes' first appearance in \"A Study in Scarlet\" (1887) and The Hound of the Baskervilles (1901-1902), through the collection of stories in the The Case-Book of Sherlock Holmes, this deluxe edition boasts the entire Holmes catalog.\n" +
                "\n" +
                "For Sherlock Holmes fans worldwide, this stunning hardcover edition is the perfect gift.");

        Author author = new Author("Sir Arthur Conan Doyle", "Sir Arthur Conan Doyle (1859-1930) was a Scottish physician and prolific writer of fiction and nonfiction. He is most well known for his four novels and fifty-six short stories featuring the legendary and eccentric detective Sherlock Holmes. Holmes was modeled after Doyle's colleague, physician and surgeon Dr. Joseph Bell, who had been known for his acute powers of deductive observation. In his real life, Doyle worked in the name of justice too. He personally investigated two cases of innocent men who had been wrongfully imprisoned and helped to get them exonerated for their \"crimes.\"\n" +
                "\n" +
                "Daniel Stashoweris a member of the Baker Street Irregulars and is the author of Teller of Tales: The Life of Arthur Conan Doyle and The Beautiful Cigar Girl: Mary Rogers, Edgar Allen Poe, and the Invention of Murder. He is also a co-editor of several other books about Sherlock Holmes and his creator, including Arthur Conan Doyle: A Life in Letters.");
        holmes.setAuthor(author);

        holmes.setFormat(BookFormat.HARD);
        holmes.setDimension(new Dimension(165, 235, 70, "mm"));

        var date = Calendar.getInstance();
        date.set(2019, 5, 25);
        holmes.setPublicationDate(date);

        Map<Currency, BigDecimal> prices = new HashMap<>();
        prices.put(Currency.HUF, BigDecimal.valueOf(13001));
        prices.put(Currency.USD, BigDecimal.valueOf(40.33));
        holmes.setPrice(prices);

        holmes.setRating(new Rate(714, 1519, 12394, 46400, 98964));

        JAXBHelper.toXML(holmes, System.out);
    }
}
