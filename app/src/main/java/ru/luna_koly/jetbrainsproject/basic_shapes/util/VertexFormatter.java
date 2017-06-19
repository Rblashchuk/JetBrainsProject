package ru.luna_koly.jetbrainsproject.basic_shapes.util;

import android.util.Log;

import java.util.Arrays;

/**
 * Created with love by iMac on 18.06.17.
 */

public class VertexFormatter {
    public static float[] getVertices(vec3... points) {
        float[] vertices = new float[points.length * 3];

        for (int i = 0; i < points.length; i++) {
            vertices[i * 3] = points[i].x;
            vertices[i * 3 + 1] = points[i].y;
            vertices[i * 3 + 2] = points[i].z;
        }

        return vertices;
    }

    public static vec3[] splitArrayToVec3(float... array) {
        int length = array.length / 3;
        vec3[] vecs = new vec3[length];

        for (int i = 0; i < length; i++)
            vecs[i] = new vec3(array[i * 3],
                               array[i * 3 + 1],
                               array[i * 3 + 2]);

        return vecs;
    }

    public static float[] generateEmptyVertexArray(int amount) {
        float[] vertices = new float[amount];

        for (int i = 0; i < vertices.length; i++) {
            vertices[i] = 0.0f;
        }

        return vertices;
    }

    public static float[] projectToCamera2D(Camera cam, float... vertices) {
        float[] relative = new float[vertices.length];

        for (int i = 0; i < vertices.length / 3; i++) {
            relative[i * 3]     = vertices[i * 3]     + cam.getX();
            relative[i * 3 + 1] = vertices[i * 3 + 1] + cam.getY();
            relative[i * 3 + 2] = vertices[i * 3 + 2] + cam.getZ();
        }

        return relative;
    }

    public static float[] getTriad(int index, float... vertices) {
        return Arrays.copyOfRange(vertices, index * 3, index * 3 + 3);
    }

    public static float[] getTriadOfPattern(float[] vertices, short[] pattern) {
        float[] all = new float[pattern.length * 3];

        for (int i = 0; i < pattern.length; i++) {
            System.arraycopy(getTriad( pattern[i], vertices ), 0, all, i * 3, 3);
        }

        return all;
    }
}
