package com.graphics.component;

import com.maths.RNG;

import java.awt.*;

public class Material {
    private static final float REFLECTANCE_DEFAULT = 32f;

    private Color colour;
    private float reflectance;

    private Texture diffuseTexture;
    private Texture normalMap;
    private Texture specularMap;

    public Material(){
        this(RNG.Colour(), REFLECTANCE_DEFAULT, null, null, null);
    }

    public Material(Color colour){
        this(colour, REFLECTANCE_DEFAULT, null, null, null);
    }

    public Material(Color colour, float reflectance){
        this(colour, reflectance, null, null, null);
    }

    public Material(Texture diffuseTexture){
        this(RNG.Colour(), REFLECTANCE_DEFAULT, diffuseTexture, null, null);
    }

    public Material(Texture diffuseTexture, Texture normalMap){
        this(RNG.Colour(), REFLECTANCE_DEFAULT, diffuseTexture, normalMap, null);
    }

    public Material(Texture diffuseTexture, Texture normalMap, Texture specularMap){
        this(RNG.Colour(), REFLECTANCE_DEFAULT, diffuseTexture, normalMap, specularMap);
    }

    public Material(Color colour, float reflectance, Texture diffuseTexture, Texture normalMap, Texture specularMap){
        this.colour = colour;
        this.reflectance = reflectance;
        this.diffuseTexture = diffuseTexture;
        this.normalMap = normalMap;
        this.specularMap = specularMap;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public float getReflectance() {
        return reflectance;
    }

    public void setReflectance(float reflectance) {
        this.reflectance = reflectance;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Texture getDiffuseTexture() {
        return diffuseTexture;
    }

    public boolean hasDiffuseTexture(){
        return diffuseTexture != null;
    }

    public void setDiffuseTexture(Texture diffuseTexture) {
        this.diffuseTexture = diffuseTexture;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Texture getNormalMap() {
        return normalMap;
    }

    public boolean hasNormalMap(){
        return normalMap != null;
    }

    public void setNormalMap(Texture normalMap) {
        this.normalMap = normalMap;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Texture getSpecularMap() {
        return specularMap;
    }

    public boolean hasSpecularMap(){
        return specularMap != null;
    }

    public void setSpecularMap(Texture specularMap) {
        this.specularMap = specularMap;
    }

}


