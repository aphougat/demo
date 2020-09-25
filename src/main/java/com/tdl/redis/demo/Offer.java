package com.tdl.redis.demo;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Offer")
public class Offer {
    public enum OfferType {
        SIMPLE, COMPLEX
    }

    private String id;
    private String name;
    private OfferType offerType;
    private int grade;

    public Offer(String id, String name, OfferType offerType, int grade) {
        this.id = id;
        this.name = name;
        this.offerType = offerType;
        this.grade = grade;
    }

    public Offer(){}

    public Offer(String id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.offerType = OfferType.COMPLEX;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OfferType getOfferType() {
        return offerType;
    }

    public void setOfferType(OfferType offerType) {
        this.offerType = offerType;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
