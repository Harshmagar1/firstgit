package com.InfastrcureJdbc.InfastrcureJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfrastructureController {
	@GetMapping("bridgescount")
	int noOfBrindgesInIndia() {
		return 7856;

	}

	@PostMapping("addbridgeInfo")
	public void addBridge(@RequestBody Bridge bridge) {
		System.out.println("bridge info " + bridge);
	}

	@RequestMapping("bridgeInfo")
	Bridge featchBridgeInfo() {
		Bridge brid = new Bridge("pune", 11, "500 mtr", "50 mtr");
		return brid;

	}

	@GetMapping("bridgesInfo")
	ArrayList<Bridge> featchBridgesInfo() {
		ArrayList<Bridge> albr = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "harshal");
			String q = "select * from bridge";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			while (set.next()) {
				String bridgeCity=set.getString(1);
				int bridgeNumber=set.getInt(2);
				String bridgeLength=set.getString(3);
				String bridgeWidth=set.getString(4);
				Bridge br = new Bridge(bridgeCity, bridgeNumber, bridgeLength, bridgeWidth);
				albr.add(br);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return albr;

	}

	@RequestMapping("citybridge/{cityName}")
	ArrayList<String> brindgesNameInCity(@PathVariable String cityName) {
		System.out.println("i am in bridge in the city  " + cityName);
		ArrayList<String> als = new ArrayList<>();
		if (cityName.equals("pune")) {
			als.add("z");
			als.add("navale");
			als.add("warje");

		} else {
			als.add("navale1");
			als.add("warje2");
			als.add("z3");

		}

		return als;

	}

}
