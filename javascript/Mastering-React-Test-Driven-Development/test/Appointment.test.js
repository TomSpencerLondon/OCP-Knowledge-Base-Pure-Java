import {Appointment } from '../src/Appointment';
import ReactDOM from 'react-dom';
import React from "react";

describe('Appointment', () => {
    let container;
    let customer;

    beforeEach(() => {
        container = document.createElement('div');
    })

    const render = component => ReactDOM.render(component, container);

    it('renders the customer first name', () => {
        customer = { firstName: 'Ashley' };
        render(<Appointment customer={customer} />, container);

        expect(container.textContent).toMatch('Ashley');
    });

    it('renders another customer first name', () => {
        customer = { firstName: 'Jordan' };
        render(<Appointment customer={customer} />, container);

        expect(container.textContent).toMatch('Jordan');
    });
});