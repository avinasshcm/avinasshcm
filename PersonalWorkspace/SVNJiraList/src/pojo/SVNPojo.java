package pojo;

import java.util.List;

public class SVNPojo {
	String jiraID;
	List<String> authors;
	List<String> revision;
	List<String> paths;

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public String getJiraID() {
		return jiraID;
	}

	public void setJiraID(String jiraID) {
		this.jiraID = jiraID;
	}

	public List<String> getRevision() {
		return revision;
	}

	public void setRevision(List<String> revision) {
		this.revision = revision;
	}

	public List<String> getPaths() {
		return paths;
	}

	public void setPaths(List<String> paths) {
		this.paths = paths;
	}
}
