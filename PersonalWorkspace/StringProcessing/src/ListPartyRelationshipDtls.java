import java.util.ArrayList;

public class ListPartyRelationshipDtls {
	public static void main(String[] args) {
		ArrayList<String[]> relationList = new ArrayList<String[]>();
		//String response = "UNIQUE_ID=20201112174214;PARTYID=AVIN002;{PT_PFN_PartyRelationship#RELATEDINTERNALPARTYID=00000368;PT_PFN_PartyRelationship#RELATIONSHIPTYPE=EMPRESA@SUBSIDIÁRIA;}{PT_PFN_PartyRelationship#RELATEDINTERNALPARTYID=AVIN001;PT_PFN_PartyRelationship#RELATIONSHIPTYPE=FILHO@PAIS;}{PT_PFN_PartyRelationship#RELATEDINTERNALPARTYID=AVIN004;PT_PFN_PartyRelationship#RELATIONSHIPTYPE=MENOR@TUTOR;}";
		//String response = "{";
		String response = "UNIQUE_ID=20201112174214;PARTYID=AVIN002;"
				+ "{PT_PFN_PartyRelationship#RELATEDINTERNALPARTYID=00000368;PT_PFN_PartyRelationship#RELATIONSHIPTYPE=EMPRESA@SUBSIDIÁRIA;}"
				+ "{PT_PFN_PartyRelationship#RELATEDINTERNALPARTYID=AVIN001;PT_PFN_PartyRelationship#RELATIONSHIPTYPE=FILHO@PAIS;}"
				+ "{PT_PFN_PartyRelationship#RELATEDINTERNALPARTYID=AVIN004;PT_PFN_PartyRelationship#RELATIONSHIPTYPE=MENOR@TUTOR;}";
		processResponse(relationList, response);
		System.out.println(relationList.size());
	}

	private static void processResponse(ArrayList<String[]> relationList, String response) {
		StringBuilder res = new StringBuilder(response);
		int indexOfBraces = res.indexOf("{");
		if (res != null && indexOfBraces > -1) {
			res.delete(0, indexOfBraces);
			//System.out.println(res.toString());
			String[] relList = res.toString().split("}");
			if (relList != null && relList.length > 0) {
				for (String relationItem : relList) {
					//System.out.println(relList[i]);
					String[] relationOneRow = new String[2];
					String[] fieldList = relationItem.replace("{", "").split(";");
					if (fieldList != null && fieldList.length > 0) {
						for (String fieldItem : fieldList) {
							//System.out.println(fieldList[j]);
							String[] valueList = fieldItem.split("=");
							if (valueList[0].contains("RELATEDINTERNALPARTYID")) {
								relationOneRow[0] = valueList[1];
							}
							if (valueList[0].contains("RELATIONSHIPTYPE")) {
								relationOneRow[1] = valueList[1];
							}
						}
					}
					if (relationOneRow[1] != null && !relationOneRow[1].isEmpty()) {
						relationList.add(relationOneRow);
					}
				}
			}
		}
	}
}
