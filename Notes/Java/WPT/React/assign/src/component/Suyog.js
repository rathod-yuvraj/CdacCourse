import { useEffect, useState, useCallback } from "react";

function Suyog() {
    const [length, setLength] = useState(12);
    const [password, setPassword] = useState("");
    const [includeNumber, setIncludeNumber] = useState(false);
    const [includeSpecialChar, setIncludeSpecialChar] = useState(false);

    const generatePassword = useCallback(() => {
        let characters = "ABCDEFGHIJKLMNOPSRTVWXYZabcdefghijklmnopqrstvwxyz";
        if (includeNumber) characters += "0123456789";
        if (includeSpecialChar) characters += "!@#$%^&*";
        let newPassword = "";
        for (let i = 0; i < length; i++) {
            newPassword += characters.charAt(
                Math.floor(Math.random() * characters.length)
            );
        }
        setPassword(newPassword);
    }, [length, includeNumber, includeSpecialChar]);

    useEffect(() => {
        generatePassword();
    }, [length, includeNumber, includeSpecialChar, generatePassword]);

    return (
        <div>
            <h1>Password Generator</h1>
            <div>
                <label>Length </label>
                <input
                    type="number"
                    value={length}
                    min="1"
                    max="32"
                    onChange={(e) => setLength(Number(e.target.value))}
                />
            </div>
            <div>
                <label>
                    <input
                        type="checkbox"
                        checked={includeNumber}
                        onChange={() => setIncludeNumber((prev) => !prev)}
                    />
                    Include Number
                </label>
            </div>
            <div>
                <label>
                    <input
                        type="checkbox"
                        checked={includeSpecialChar}
                        onChange={() => setIncludeSpecialChar((prev) => !prev)}
                    />
                    Include Symbols
                </label>
            </div>
            <div>
                <label>Password: </label>
                <input type="text" value={password} readOnly />
            </div>
        </div>
    );
}

export default Suyog;