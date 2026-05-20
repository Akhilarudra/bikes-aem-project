package com.project.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(
    adaptables = Resource.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class CardListModel {

    @ChildResource
    private List<CardItem> cards;

    public List<CardItem> getCards() {
        return cards;
    }

    @Model(adaptables = Resource.class)
    public static class CardItem {

        @Inject
        private String title;

        @Inject
        private String description;

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }
    }
}