export function Card({ image, name, status, category }) {
    return (
        <div class="card">
            <img src={image} alt="Foto de Perfil" class="profile-image" />
            <div class="info">
                <p>{name}</p>
                <p>{category}</p>
                <p>{status}</p>
            </div>
        </div>
    )
}