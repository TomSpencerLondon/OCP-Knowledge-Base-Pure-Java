const getPlayers = () => [
    {name: 'craig'},
];

const getPlayer = (name) => getPlayers().find(player => player.name === name);

module.exports = {
    getPlayers,
    getPlayer,
};
