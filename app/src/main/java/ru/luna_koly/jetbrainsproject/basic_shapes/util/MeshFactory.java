package ru.luna_koly.jetbrainsproject.basic_shapes.util;

import ru.luna_koly.jetbrainsproject.basic_shapes.VertexQuad;
import ru.luna_koly.jetbrainsproject.basic_shapes.VertexQuadOfTriangles;
import ru.luna_koly.jetbrainsproject.basic_shapes.VertexTriangle;

/**
 * Created with love by iMac on 18.06.17.
 */

public class MeshFactory {

    private static Mesh exampleRectangle;

    public static VertexTriangle getExampleTriangle() {
        float[] vertices = {                // counterclockwise
                +0.0f, +0.622008459f, 0.0f,
                -0.5f, -0.311004243f, 0.0f,
                +0.5f, -0.311004243f, 0.0f
        };

        return new VertexTriangle(vertices);
    }

    public static Mesh getExampleRectangle() {
        float[] vertices = {                // counterclockwise
                -0.5f, +0.5f, 0.0f,
                -0.5f, -0.5f, 0.0f,
                +0.5f, -0.5f, 0.0f,
                +0.5f, +0.5f, 0.0f };

        return new VertexQuadOfTriangles(vertices);
    }
}
