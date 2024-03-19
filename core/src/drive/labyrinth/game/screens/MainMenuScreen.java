package drive.labyrinth.game.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

import drive.labyrinth.game.Core;

public class MainMenuScreen implements Screen {

    SpriteBatch batch;
    Stage gui;
    Texture image;
    OrthographicCamera camera;

    public MainMenuScreen() {
        batch = new SpriteBatch();
        gui = new Stage();
        image = new Texture("DungeonTileset.png");
        camera = new OrthographicCamera();
        camera.setToOrtho(false);
        camera.position.setZero();
        camera.zoom = 0.5f;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        camera.update();

        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(image, 0, 0);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {

    }

}
