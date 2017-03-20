package com.lwkandroid.imagepicker.ui.grid.view;

import com.lwkandroid.imagepicker.base.activity.IImageBaseView;
import com.lwkandroid.imagepicker.data.ImageBean;
import com.lwkandroid.imagepicker.data.ImageFloderBean;
import com.lwkandroid.imagepicker.data.ImagePickerOptions;

import java.util.List;

/**
 * Created by LWK
 * TODO ImageDataActivity的View层接口
 */

public interface IImageDataView extends IImageBaseView
{
    ImagePickerOptions getOptions();

    void startTakePhoto();

    void showLoading();

    void hideLoading();

    void onDataChanged(List<ImageBean> dataList);

    void onFloderChanged(ImageFloderBean floderBean);

    void onImageClicked(ImageBean imageBean);

    void onSelectNumChanged(int curNum);

    void warningLimitNum();
}