package org.parceler;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@Parcel
public class PackagePrivateConstructorModifier {
    String one;

    public PackagePrivateConstructorModifier(){}

    @ParcelConstructor
    PackagePrivateConstructorModifier(String one){
        this.one = one;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}