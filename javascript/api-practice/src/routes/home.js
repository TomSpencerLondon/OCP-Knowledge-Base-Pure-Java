const route = require('express').Router();
const fetchAllRepos = require("../../api/apiConnection");
import { getAllPosts } from '.'

route.get("/", async (req, res, next) => {
    try {
        const apiData = await fetchAllRepos();

        res.render('home', {
            apiData: apiData[0].id,
        });
    }catch (e) {
        res.render("error", {error: "This failed"})
    }
});


module.exports = route;
