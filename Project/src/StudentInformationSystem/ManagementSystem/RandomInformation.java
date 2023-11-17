package StudentInformationSystem.ManagementSystem;

import StudentInformationSystem.APIs.MyRandom;
import StudentInformationSystem.Enums.EmailEnums;

import java.util.ArrayList;
import java.util.Arrays;

public class RandomInformation
{
	private RandomInformation() {}

	public static String getRandomEmail()
	{
		ArrayList<EmailEnums> emails = new ArrayList<EmailEnums>(Arrays.asList(EmailEnums.values()));

		long emailHead = MyRandom.secureRandom()
		                         .nextLong(100000000, 999999999);
		String emailDomain = emails.get(MyRandom.secureRandom()
		                                        .nextInt(emails.size()))
		                           .getDomain();

		return emailHead + "@" + emailDomain;
	}

	public static String getRandomPhoneNumber()
	{
		ArrayList<String> phoneNumberHead = new ArrayList<>(
				Arrays.asList("130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "150", "151", "152",
				              "153", "155", "156", "157", "158", "159", "170", "171", "172", "173", "174", "175", "176",
				              "177", "178", "180", "181", "182", "183", "184", "185", "186", "187", "188", "189", "191",
				              "198", "199"));

		long phoneNumberTail = MyRandom.secureRandom()
		                               .nextLong(10000000, 99999999);

		return phoneNumberHead.get(MyRandom.secureRandom()
		                                   .nextInt(phoneNumberHead.size())) + phoneNumberTail;
	}

	public static int getRandomAge()
	{
		return MyRandom.secureRandom()
		               .nextInt(18, 25);
	}

	public static String getRandomAddress()
	{
		ArrayList<String> addresses = new ArrayList<String>(
				Arrays.asList("北京市海淀区", "北京市朝阳区", "北京市丰台区", "北京市石景山区", "北京市通州区",
				              "北京市昌平区", "北京市大兴区", "北京市顺义区", "北京市房山区", "北京市门头沟区",
				              "北京市怀柔区", "北京市平谷区", "北京市密云区", "北京市延庆区"));

		return addresses.get(MyRandom.secureRandom()
		                             .nextInt(addresses.size()));
	}

	public static String getRandomName()
	{

		ArrayList<String> firstNames = new ArrayList<String>(
				Arrays.asList("赵", "钱", "孙", "李", "周", "吴", "郑", "王"));
		ArrayList<String> lastNames = new ArrayList<String>(
				Arrays.asList("一", "二", "三", "四", "五", "六", "七", "八", "九"));

		return firstNames.get(MyRandom.secureRandom()
		                              .nextInt(firstNames.size())) + lastNames.get(MyRandom.secureRandom()
		                                                                                   .nextInt(lastNames.size()));
	}
}
