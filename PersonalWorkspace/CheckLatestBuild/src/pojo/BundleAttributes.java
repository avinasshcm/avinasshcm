package pojo;

import java.io.File;

public class BundleAttributes {
	File sourcePatch;
	File sourceKey;
	File destPatch;
	File destKey;
	String bundleName;
	String keyName;

	public File getSourcePatch() {
		return sourcePatch;
	}

	public void setSourcePatch(File sourcePatch) {
		this.sourcePatch = sourcePatch;
	}

	public File getSourceKey() {
		return sourceKey;
	}

	public void setSourceKey(File sourceKey) {
		this.sourceKey = sourceKey;
	}

	public File getDestPatch() {
		return destPatch;
	}

	public void setDestPatch(File destPatch) {
		this.destPatch = destPatch;
	}

	public File getDestKey() {
		return destKey;
	}

	public void setDestKey(File destKey) {
		this.destKey = destKey;
	}

	public String getBundleName() {
		return bundleName;
	}

	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
}
